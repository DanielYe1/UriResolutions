#include <stdio.h>
#include <iostream>

using namespace std;

int main() {
	int size;
	cin >> size;
	int height[size];
	for (int i = 0; i < size; ++i) {
		cin >> height[i];
	}
	int left[size];
	int right[size];
	int tempLeft = 0;
	int tempRight = 0;
	for (int i = 0; i < size; ++i) {
		tempLeft++;
		tempRight++;
		if (tempLeft > height[size - i - 1]) {
			tempLeft = height[size - i - 1];
		}
		if (tempRight > height[i]) {
			tempRight = height[i];
		}
		left[i] = tempLeft;
		right[i] = tempRight;
	}
	int lower;
	int ans = 0;
	for (int i = 0; i < size; ++i) {
		if (left[size-i-1] < right[i]) {
			lower = left[size-1-i];
		} else {
			lower = right[i];
		}
		if (lower > ans) {
			ans = lower;
		}
	}
	cout << ans << endl;
	return 0;
}
