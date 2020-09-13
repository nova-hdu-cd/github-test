#include <bits/stdc++.h>
using namespace std;

string A, B;
vector<bool> used;
vector<string> arr;
bool over = false;
string res;

void backtrack(int index, string& str) {
    if(index == B.size()) {
        if((str > A) && (res.empty() || str < res)) {
            res = str;
        }
        return;
    }
    for(int i = 0; i < B.size(); i++) {
        if(!used[i]) {
            used[i] = true;
            str.push_back(B[i]);
            backtrack(index+1, str);
            used[i] = false;
            str.pop_back();
        }
    }
}

int main() {
    int N;//位数
    cin >> N;
    cin >> A >> B;
    used = vector<bool>(N, false);
    string str;
    sort(B.begin(), B.end(), greater<char>());
    backtrack(0, str);
    if(res.empty())
        cout << -1 << endl;
    else
        cout << res << endl;
    return 0;
}