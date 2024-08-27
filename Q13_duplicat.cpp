#include <iostream>
#include <cstring>

using namespace std;

int main() {
    const char* strings[] = {"apple", "banana", "orange", "apple", "kiwi", "banana", "grape", "apple"};
    
    int length = sizeof(strings) / sizeof(strings[0]);  
    bool foundDuplicate = false;

    cout << "Duplicate strings:" << endl;
    for (int i = 0; i < length - 1; i++) {
        for (int j = i + 1; j < length; j++) {
            if (strcmp(strings[i], strings[j]) == 0) {
                cout << strings[i] << endl;
                foundDuplicate = true;
                break;
            }
        }
    }

    if (!foundDuplicate) {
        cout << "No duplicates found." << endl;
    }

    return 0;
}
