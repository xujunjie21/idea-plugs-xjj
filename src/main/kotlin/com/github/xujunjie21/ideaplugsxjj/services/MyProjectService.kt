package com.github.xujunjie21.ideaplugsxjj.services

import com.intellij.openapi.project.Project
import com.github.xujunjie21.ideaplugsxjj.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
