//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;


// } Driver Code Ends

class Solution {
    bool good(vector<int> &mp, vector<int> &m) {
        for(int i=0; i<26; i++) {
            if(m[i] && m[i] > mp[i]) return false;
        }
        return true;
    }
    public:
    string smallestWindow (string s, string p) {
        if(s.size() < p.size()) return "-1";
        vector<int> m(26), mp(26);
        for(char c : p) m[c - 'a']++;
        
        int i = 0, n = s.size(), l = -1e9, r = 0;
        for(int j=0; j<n; j++) {
            mp[s[j] - 'a']++;
            while(i <= j && good(mp, m)) {
                if(r - l > j - i) l = i, r = j;
                mp[s[i] - 'a']--;
                i++;
            }
        }
        return l == -1e9 ? "-1" : s.substr(l, r - l + 1);
    }
};

//{ Driver Code Starts.
int main()
 {
    int t;
    cin>>t;
    while(t--)
    {
        string s;
        cin>>s;
        string pat;
        cin>>pat;
        Solution obj;
        cout<<obj.smallestWindow(s, pat)<<endl;
        
    }
	return 0;
}
// } Driver Code Ends