#include <iostream>
#include <stdio.h>

using namespace std;

int main() {
    string tweet;
    getline(cin, tweet);
    if(tweet.length() > 140){
        printf("MUTE\n");
    }else{
        printf("TWEET\n");
    }

    return 0;
}