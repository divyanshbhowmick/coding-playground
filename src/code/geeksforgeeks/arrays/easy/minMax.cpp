/**
 * Program to find the minimum (or maximum) element of an array
Difficulty Level : Easy
Last Updated : 07 May, 2021
Given an array, write functions to find the minimum and maximum elements in it. 
*/

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

std::pair<int, int> getMinMax(int arr[], int n)
{
    std::pair<int, int> result = std::make_pair(arr[0], arr[0]);

    for (int i = 0; i < n; i++)
    {
        if(arr[i] < result.first) result.first = arr[i];
        if(arr[i] > result.second) result.second = arr[i];
    }
    return result;
}

int main()
{
    file_i_o();

    // Write your code below @@

    int n, arr[n];

    std::cin >> n;

    for (int i = 0; i < n; i++)
    {
        std::cin >> arr[i];
    }

    std::pair<int, int> minMax = getMinMax(arr, n);
    std::cout<<minMax.first<<" "<<minMax.second;
}