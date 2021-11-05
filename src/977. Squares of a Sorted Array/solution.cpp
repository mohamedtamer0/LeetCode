/**
 * 132 / 132 test cases passed
 * Status: Accepted
 * Runtime: 72 ms
 */
class Solution {
public:
    vector<int> sortedSquares(vector<int>& A) {
        int left = 0, right = A.size() - 1, idx = A.size() - 1;
        vector<int> ans ( A.size() );
        while ( left <= right ) {
            if ( - A[left] < A[right] ) {
                ans[ idx -- ] = A[right] * A[ right -- ];
            } else {
                ans[ idx -- ] = A[left] * A[ left ++ ];
            }
        }
        return ans;
    }
};

/**
 * 132 / 132 test cases passed
 * Status: Accepted
 * Runtime: 60 ms
 */
class Solution2 {
public:
    vector<int> sortedSquares(vector<int>& A) {
        int sz = A.size();
        vector<int> ans ( sz );
        for ( int l = 0, r = sz - 1, idx = sz - 1; l <= r; -- idx ) {
            if ( - A[l] < A[r] ) {
                ans[idx] = A[r] * A[r];
                -- r;
            } else {
                ans[idx] = A[l] * A[l];
                ++ l;
            }
        }
        return ans;
    }
};