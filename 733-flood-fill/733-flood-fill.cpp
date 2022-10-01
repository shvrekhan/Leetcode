class Solution {
public:
    void dfs(vector<vector<int>>& image, int sr, int sc, int color,int c,vector<vector<int>>&v){
        if(image[sr][sc]==c)image[sr][sc] = color;
        v[sr][sc]=1;
        
        int delrow [] = {-1,0,1,0};
        int delcol [] = {0,-1,0,1};
        for(int i=0;i<4;i++){
            int nrow = sr+delrow[i];
            int ncol = sc+delcol[i];
    if(nrow>=0 && nrow<image.size() && ncol>=0 && ncol<image[0].size() && v[nrow][ncol]!=1 && image[nrow][ncol]==c){
            dfs(image,nrow,ncol,color,c,v);
        }
        }
    }
    vector<vector<int>> floodFill(vector<vector<int>>& image, int sr, int sc, int color) {
        int m = image.size();
        int n = image[0].size();
        vector<vector<int>>v(m,vector<int>(n,0));
        int c = image[sr][sc];
        dfs(image,sr,sc,color,c,v);
        return image;
    }
};