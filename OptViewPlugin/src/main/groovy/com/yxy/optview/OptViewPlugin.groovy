package com.yxy.optview
import com.android.build.api.transform.*
import com.android.build.gradle.internal.pipeline.TransformManager
import org.gradle.api.Plugin
import org.gradle.api.Project


class OptViewPlugin extends Transform implements Plugin<Project> {

    @Override
    void apply(Project project) {
        println 'Hello OptViewPlugin223'
    }

    @Override
    String getName() {
        return "OptViewPlugin"
    }

    @Override
    Set<QualifiedContent.ContentType> getInputTypes() {
        return TransformManager.CONTENT_CLASS
    }

    @Override
    Set<? super QualifiedContent.Scope> getScopes() {
        return TransformManager.SCOPE_FULL_PROJECT
    }

    @Override
    boolean isIncremental() {
        return false
    }
}