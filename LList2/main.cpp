/*
 * Created by: Michael Carr
 * Just a little easy program to practice linked lists while waiting for the smoke to clear and get back to school.
 * This was not an assignment just something to pass the time.
 * Date: 10/30/2019
 */

#include <iostream>
#include <fstream>
#include <string>
#include "LList.h"

using namespace std;

int main() {
    LList list;
    //Ask for a file until there is a valid one
    string filename; ifstream input; bool success;
    cout << "Give me an input file: " << flush;
    cin >> filename;
    input.open(filename.c_str());
    while(input.fail()){
        input.clear();
        cout << "Incorrect file, try again:" << flush;
        cin >> filename;
        input.open(filename.c_str());
    }

    //put each entry into a link list
    string str;
    while (getline(input, str)){
        success = list.AddNode(str);
        if (success){
            cout << "successfully added node" << endl;
        }}

    //print the list
    list.PrintList();

    //Destroy the list. Within the destructor PrintList is called to verify the list has been wiped.
    cout << "Destructor called" << endl;

}