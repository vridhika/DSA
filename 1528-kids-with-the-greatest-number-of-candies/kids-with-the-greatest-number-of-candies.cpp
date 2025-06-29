class Solution {
public:
    vector<bool> kidsWithCandies(vector<int>& candies, int extraCandies) {
        int maxCandy = *max_element(candies.begin(), candies.end());
        vector<bool> output;

        for (int candy : candies) {
            output.push_back(candy + extraCandies >= maxCandy);
        }

        return output;
    }
};
