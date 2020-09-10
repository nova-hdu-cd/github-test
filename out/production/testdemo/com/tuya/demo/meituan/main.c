#include <iostream>
#include <vector>
using namespace std;

unsigned int getBi(int index,unsigned int ai, int n) {
	unsigned int bi = ai;
	for (int i = 1; i <= n; i++) {
		bi ^= (index % i);
	}
	return bi;
}

int main()
{
	unsigned int n;
	cin >> n;
	vector<unsigned int> a(n+1);
	vector<unsigned int> b(n + 1);
	for (int i = 1; i <= n; i++) {
		cin >> a[i];
	}
	/* 计算bi */
	for (int i = 1; i <= n; i++) {
		b[i] = getBi(i, a[i], n);
	}
	unsigned int ans = 0;
	for (int i = 1; i <= n; i++) {
		ans ^= b[i];
	}
	cout << ans << endl;
	return 0;
}