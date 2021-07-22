#include <bits/stdc++.h>
using namespace std;

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

vector<int> reverseArray(vector<int> arr)
{
    int N = arr.size();
    vector<int> revesrsedArray(N);
    int start = 0, end = N - 1;
    for (int i = 0; i < N / 2; i++)
    {
        revesrsedArray[i] = arr[end];
        revesrsedArray[end] = arr[i];
        end--;
    }
    if (N % 2 == 1)
        revesrsedArray[N / 2] = arr[N / 2];
    return revesrsedArray;
}

void printArray(vector<int> arr)
{

    for (auto n : arr)
        cout << n << " ";
    cout << "\n";
}

int main()
{
    file_i_o();

    int N;
    cin >> N;
    vector<int> arr(N);

    for (int i = 0; i < N; i++)
        cin >> arr[i];
    printArray(arr);
    vector<int> reversedArray = reverseArray(arr);
    printArray(reversedArray);
}