class Solution
{
    public:
        bool checkIfPangram(string sentence)
        {
            unordered_map<char, int> map;
            for (int i = 0; i < sentence.size(); i++)
            {
                map[sentence[i]]++;
                if (map.size() == 26) return true;
            }
            cout << map.size();
            return false;
        }
};