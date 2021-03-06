package com.damdamdeo.todoapp.it;

import org.junit.runner.RunWith;

import cucumber.runtime.arquillian.CukeSpace;
import cucumber.runtime.arquillian.api.Features;
import cucumber.runtime.arquillian.api.Glues;

@Features("com/damdamdeo/todoapp/it/Todo.feature")
@RunWith(CukeSpace.class)
@Glues(TodoFeatureITSteps.class)
public class TodoFeatureIT {

}
