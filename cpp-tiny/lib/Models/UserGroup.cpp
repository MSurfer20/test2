

#include "UserGroup.h"

using namespace Tiny;

UserGroup::UserGroup()
{
	name = std::string();
	description = std::string();
	members = std::list<int>();
	id = int(0);
}

UserGroup::UserGroup(std::string jsonString)
{
	this->fromJson(jsonString);
}

UserGroup::~UserGroup()
{

}

void
UserGroup::fromJson(std::string jsonObj)
{   
    bourne::json object = bourne::json::parse(jsonObj);

    const char *nameKey = "name";
    
    if(object.has_key(nameKey)) 
    {
        bourne::json value = object[nameKey];


        
        jsonToValue(&name, value, "std::string");


    }

    const char *descriptionKey = "description";
    
    if(object.has_key(descriptionKey)) 
    {
        bourne::json value = object[descriptionKey];


        
        jsonToValue(&description, value, "std::string");


    }

    const char *membersKey = "members";
    
    if(object.has_key(membersKey)) 
    {
        bourne::json value = object[membersKey];


        std::list<int> members_list;
        int element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "int");
            
            
            members_list.push_back(element);
        }
        members = members_list;


    }

    const char *idKey = "id";
    
    if(object.has_key(idKey)) 
    {
        bourne::json value = object[idKey];


        
        jsonToValue(&id, value, "int");


    }


}

bourne::json
UserGroup::toJson()
{
    bourne::json object = bourne::json::object();

    



    object["name"] = getName();


    



    object["description"] = getDescription();


    
    
    
    std::list<int> members_list = getMembers();
    bourne::json members_arr = bourne::json::array();

    for(auto& var : members_list)
    {
        members_arr.append(var);
    }
    object["members"] = members_arr;

    



    



    object["id"] = getId();



    return object;

}

std::string
UserGroup::getName()
{
	return name;
}

void
UserGroup::setName(std::string  name)
{
	this->name = name;
}

std::string
UserGroup::getDescription()
{
	return description;
}

void
UserGroup::setDescription(std::string  description)
{
	this->description = description;
}

std::list<int>
UserGroup::getMembers()
{
	return members;
}

void
UserGroup::setMembers(std::list <int> members)
{
	this->members = members;
}

int
UserGroup::getId()
{
	return id;
}

void
UserGroup::setId(int  id)
{
	this->id = id;
}



