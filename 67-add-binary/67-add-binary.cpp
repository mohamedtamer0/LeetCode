class Solution {
public:
    string addBinary(string a, string b) {
        int N = max(a.size(), b.size()) + 1;
        
        //padding 
        a.insert(a.begin(), N-a.size(), '0');
        b.insert(b.begin(), N-b.size(), '0');
        
        reverse(a.begin(), a.end());
        reverse(b.begin(), b.end());
        
        int i = 0, carry = 0;
        //add b to a
        for(int i = 0; i < N; i++) {
            int ai = a[i] - '0', bi = b[i] - '0';
            int sumi = ai + bi + carry;
            switch(sumi) {
                case 3:
                    a[i] = '1';
                    carry = 1;
                    break;
                case 2:
                    a[i] = '0';
                    carry = 1;
                    break;
                case 1:
                    a[i] = '1';
                    carry = 0 ;
                    break;
            }
        }
        
        if(a[N-1] == '0') a.resize(N-1);
        reverse(a.begin(), a.end());
        return a;
    }
};