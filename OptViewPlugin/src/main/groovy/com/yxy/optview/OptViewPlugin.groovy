package com.yxy.optview

import org.gradle.api.Plugin
import org.gradle.api.Project


class OptViewPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        println 'Hello OptViewPlugin22'
    }
}