package com.yxy.opt

import org.gradle.api.Plugin

import org.gradle.api.Project

class PluginTest implements Plugin<Project>{

    @Override
    void apply(Project project) {
        println 'Hello PluginTest2234'
    }
}