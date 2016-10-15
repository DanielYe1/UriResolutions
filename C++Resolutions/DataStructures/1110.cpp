#include <iostream>
#include <queue> 

using namespace std;

int main()
{
    int time;
    scanf("%d", &time);
    while (time != 0) {
        queue<int> myqueue;
        for (int i = 1; i < time + 1; i++)
        {
            myqueue.push(i);
        }
        printf("Discarded cards:");
        bool first = true;
        while (time > 1) {
            if (first) {
                printf(" %d", myqueue.front());
                first = false;
            }
            else {
                printf(", %d", myqueue.front());
            }
            myqueue.pop();
            myqueue.push(myqueue.front());
            myqueue.pop();
            time--;
        }
        printf("\n");
        printf("Remaining card: %d\n", myqueue.front());
        scanf("%d", &time);
    }
    return 0;
}