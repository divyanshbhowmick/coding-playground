/**
 * Check if a key is present in every segment of size k in an array
Difficulty Level : Easy
Given an array arr[] and size of array is n and one another key x, 
and give you a segment size k. The task is to find that the key x present in every segment of size k in arr[].

Input : 
arr[] = { 3, 5, 2, 4, 9, 3, 1, 7, 3, 11, 12, 3} 
x = 3 
k = 3 
Output : Yes 
There are 4 non-overlapping segments of size k in the array, {3, 5, 2}, {4, 9, 3}, {1, 7, 3} and {11, 12, 3}. 3 is present all segments.

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

bool checkIfKeyPresentInSegment(int arr[], int n, int searchElement, int segementSize, int startIndex)
{
    bool result = false;
    for (int j = 0; j < segementSize; j++)
    {
        if (startIndex + j < n)
        {
            if (arr[startIndex + j] == searchElement)
                result = true;
        }
    }
    return result;
}

bool solution(int arr[], int n, int searchElement, int segmentSize)
{

    int searchCount = 0;
    for (int i = 0; i < n; i += segmentSize)
    {
        // std::cout << i << "\n"; 
        if (checkIfKeyPresentInSegment(arr, n, searchElement, segmentSize, i))
            searchCount++;
    }
    int rem = n % segmentSize;

    int expectedSearchCount = rem == 0 ? n / segmentSize : n / segmentSize + 1;
    // std::cout << searchCount << " " << expectedSearchCount << " " << n << "\n";
    return searchCount == expectedSearchCount;
}

int main()
{
    file_i_o();

    // Write your code below @@

    int a, n, searchElement, segmentSize;

    std::cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++)
    {
        std::cin >> arr[i];
    }

    std::cin >> searchElement;
    std::cin >> segmentSize;

    if (solution(arr, sizeof(arr) / sizeof(arr[0]), searchElement, segmentSize))
        std::cout << "Yes";
    else
        std::cout << "No";
}