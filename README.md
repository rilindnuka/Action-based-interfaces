# Action-based-interfaces
This project allows user to use steps and actions

## Interfaces 
There are two interfaces that we have declared. The first one is called `Action` and the second one is a service that we called `ActionService`

### The Process
We have implemented an `ActionController` that has an autowired `ActionService`

The service has one method that returns the desired response.

### The Service and Actions
The service has a start method that triggers various actions. 

For the simplicity of the demo we have three actions implemented,
and we log every action.

Spring allows us without qualifiers to select a particular action implementation based on the name of the injected `Action` interface on the constructor
> public Service(Action< Model > firstAction)
 
In this instance the `FirstAction` implementation will be selected!

<hr>
No configuration is needed