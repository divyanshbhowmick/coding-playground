#include <bits/stdc++.h>

void file_i_o()
{
    std::ios_base::sync_with_stdio(0);
    std::cin.tie(0);
    std::cout.tie(0);
#ifndef ONLINE_JUDGE
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
#endif
}

std::vector<std::vector<std::pair<int, int>>> adj;

std::vector<int> shortestDistanceUsingBFS(int src, int color, int vertices)
{
    std::queue<int> qu;
    std::vector<int> dist(vertices + 1, -1);

    dist[src] = 0;

    while (not qu.empty())
    {
        int node = qu.front();
        qu.pop();

        for (auto nb : adj[node])
        {
            if (dist[nb.first] != -1 or nb.second != color)
            {
                continue;
            }
            qu.push(nb.first);
            dist[nb.first] = dist[node] + 1;
        }
    }
    return dist;
}

int main()
{
    file_i_o();

    int vertices, edges;
    std::cin >> vertices >> edges;

    // just allocate 1 extra space as we are using the node values from 1 not from zero;
    adj.reserve(vertices + 1);

    while (edges--)
    {
        int i, j, c;
        std::cin >> i >> j >> c;
        adj[i].push_back(std::make_pair(j, c));
        adj[j].push_back(std::make_pair(i, c));
    }

    int src, dest;
    std::cin >> src >> dest;

    // 0 is red color, 1 is blue color

    std::vector<int> srcDist = shortestDistanceUsingBFS(src, 0, vertices);
    std::vector<int> destDist = shortestDistanceUsingBFS(dest, 1, vertices);

    int ans = INFINITY;

    for (int i = 1; i <= vertices; i++)
    {
        if (i == src or i == dest or srcDist[i] == -1 or destDist[i] == -1 or destDist[dest] == -1)
        {
            continue;
        }
        ans = std::min(ans, srcDist[i] + destDist[i]);
    }
    if (ans == INFINITY)
        ans = -1;
    std::cout << ans << "\n";
}
