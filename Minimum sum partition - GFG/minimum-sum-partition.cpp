//{ Driver Code Starts
#include <bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution{

  public:
	int minDifference(int arr[], int n)  { 
	    // Your code goes here
	    int sum =0;
	    for(int i=0;i<n;i++)
	    	{
	    		sum = sum+arr[i];
	    	}
	    int dp[n+1][sum+1];
	    for(int i=0;i<n;i++)dp[i][0]=1;
	    for(int i=1;i<sum;i++)dp[0][i]=0;
	    for(int i=1;i<=n;i++)
	    {
	        for(int j=1;j<=sum;j++)
	        {
	            if(j>=arr[i-1])
	            {
	                dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
	            }
	            else dp[i][j] = dp[i-1][j];
	        }
	    }
	   // for(int i=0;i<=sum;i++)cout<<dp[n][i]<<endl;
	    vector<int>v;
	    int m=INT_MAX;
	    for(int i=1;i<=sum;i++)
	    {
	        if(dp[n][i]==1)v.push_back(i);
	    }
	    for(int i=0;i<v.size();i++)
	    {
	    	m = min(m,abs(sum-2*v[i]));
	    }
	   
	    return m;
	} 
};


//{ Driver Code Starts.
int main() 
{
   
   
   	int t;
    cin >> t;
    while (t--)
    {
        int n;
        cin >> n;

        int a[n];
        for(int i = 0; i < n; i++)
        	cin >> a[i];

       

	    Solution ob;
	    cout << ob.minDifference(a, n) << "\n";
	     
    }
    return 0;
}
// } Driver Code Ends