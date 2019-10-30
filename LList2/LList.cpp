//
// Created by Michael Carr on 10/30/2019.
// Just messing around getting used to Linked Lists again.
//

#include <iostream>
#include <string>
#include "LList.h"

//Default constructor. Setting values to default value.
LList::LList() {
    head = nullptr;
    curr = nullptr;
    temp = nullptr;
}

LList::~LList(){
    nodePtr n = head;
    while (n != 0){
        nodePtr m = n->next;
        delete n;
        n = m;
    }
    head = 0;
    PrintList();
}

bool LList::AddNode(std::string addData) {

    //make a new node pointer called n then point it to the new node.
    nodePtr n = new node;

    //entering node at end of list
    n->next = nullptr;

    //filling the node with a value
    n->data = addData;

    //if there is a list which means a head has already created
    if(head != nullptr){
        //always starts at the the head and changes as is goes through the while loop
        curr = head;
        //check if we are at the end of the list
        while(curr->next != nullptr){
            //if not go to the next one
            curr = curr->next;
        }
        curr->next = n;
        return true;
    }

    //If not this becomes the head.
    else{
        head = n;
        return true;
    }
}

void LList::DeleteNode(std::string delData) {
    nodePtr delPtr = nullptr;
    temp = head;
    curr = head;

    while (curr != nullptr && curr->data != delData){
        temp = curr;
        curr = curr->next;
    }

    if (curr == nullptr){
        std::cout << delData << " was not in the list." << std::endl;
        delete delPtr;
    }

    else{
        delPtr = curr;
        curr = curr->next;
        temp->next = curr;
        delete delPtr;
        std::cout << "The value " << delData << " was deleted." << std::endl;
    }

}

void LList::PrintList() {
    if (head == nullptr)
        std::cout << "Nothing to print" << std::endl;
    else{
        curr = head;
        while(curr != nullptr){
            std::cout << curr->data << std::endl;
            curr = curr->next;
    }}
}