package com.github.konradohappy.plugintest.services

import com.github.konradohappy.plugintest.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
