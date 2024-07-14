package com.example.demo.ch3;

public class ContextualizedDependencyLoopup implements ManagedComponent{

    //private Dependency dependency;
    @Override
    public void performLookup(Container container) {
    //    this.dependency = (Dependency) container.getDependency("myDependency");
    }
}
