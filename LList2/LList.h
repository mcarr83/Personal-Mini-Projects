//
// Created by Michael Carr on 10/30/2019.
//

#ifndef LLIST2_LLIST_H
#define LLIST2_LLIST_H

#include <iostream>
#include <cstdlib>
#include <string>

class LList {
//Where outside files can not interact with List class directly
private:
    typedef struct node{
        std::string data;
        node* next; //points to next node
    }* nodePtr; //nodePtr used to save some time

    nodePtr head;
    nodePtr curr;
    nodePtr temp;

    //Where other files can interact with the List class
public:
    //Function prototypes
    LList(); //Default constructor
    ~LList(); //Destructor
    bool AddNode(std::string addData);
    void DeleteNode(std::string delData);
    void PrintList();


};


#endif //LLIST2_LLIST_H
