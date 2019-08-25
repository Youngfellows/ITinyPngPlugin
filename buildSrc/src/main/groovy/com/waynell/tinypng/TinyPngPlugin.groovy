/**
 * Created by Wayne Yang
 * Copyright (c) 2015-present, mogujie.
 * All rights reserved.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 *
 */

package com.waynell.tinypng

import org.gradle.api.Plugin
import org.gradle.api.Project

public class TinyPngPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        println "在这里进行图片压缩...${project.name}"

        //关联扩展属性，获取属性值
        project.extensions.create("tinyInfo", TinyPngExtension);

        //执行自定义Task任务
        project.afterEvaluate {
            project.task("tinyPng", type: TinyPngTask)
        }
    }
}