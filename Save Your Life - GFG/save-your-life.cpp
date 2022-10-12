//{ Driver Code Starts
//Initial Template for C++

#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
//User function Template for C++

class Solution{
public:

      string maxSum(string w,char x[], int b[],int n){
          
          // TAKE A MAP TO STORE THE NEW ASCII VALUES
          unordered_map<char,int> mp;
          
          // overwrite the values that are present in the redefined array
          for(int i=0;i<n;i++)
          {
              mp[x[i]] = b[i];
          }
          
          
          int arrsize = w.size();
          int maxSum = INT_MIN;
          int sum = 0;
          
          int curStart = 0;
          int bestStart = 0;
          int end = 0;
          
          for(int i=0;i<arrsize;i++)
          {
              if(mp.count(w[i]))
              {
                sum+=mp[w[i]];
              }
              else sum += w[i];
              
              if(sum<0) 
              {
                  sum = 0;
                  curStart = i+1;
              }
              
              else if(sum>maxSum)
              {
                  maxSum = sum ;
                  bestStart = curStart;
                  end = i;
              }
          }
          
           return w.substr(bestStart,end-bestStart+1);

          
      }
};

//{ Driver Code Starts.
int main() 
{ 
    int t;
    cin>>t;
    while(t--)
    {
        string w;
        cin>>w;
        int n;
        cin>>n;
        char x[n];
        int b[n];
        for(int i = 0;i<n;i++)
            cin>>x[i];
        for(int i = 0;i<n;i++)
            cin>>b[i];
        Solution ob;
        cout << ob.maxSum(w,x,b,n) << endl;
    }
    return 0; 
}
// } Driver Code Ends