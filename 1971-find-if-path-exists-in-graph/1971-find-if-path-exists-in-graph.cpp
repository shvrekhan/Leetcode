class Solution {
public:
    bool validPath(int n, vector<vector<int>>& edges, int source, int destination) {
        if(n==1)return true;
        vector<vector<int>>list(n);
        for(int i=0;i<edges.size();i++){
            list[edges[i][0]].push_back(edges[i][1]);
            list[edges[i][1]].push_back(edges[i][0]);
        }
        queue<int>q;
        vector<bool>visited(n-1,false);
        q.push(source);
        visited[source] = true;
        while(!q.empty()){
            int top = q.front();q.pop();
            if(top == destination)return true;
                for(int i=0;i<list[top].size();i++){
                    if(visited[list[top][i]]==false){
                        q.push(list[top][i]);
                        visited[list[top][i]] = true;
                    }
                    
                }   
            
        }
        return false;
        
    }
};