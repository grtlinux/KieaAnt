KieaAnt
=======
Ant project informations


Tutorial: Hello world with Apache Ant
-------------------------------------
[Tutorial: Hello world with Apache Ant](https://ant.apache.org/manual/tutorial-HelloWorldWithAnt.html "Tutorial: Hello world with Apache Ant")

```xml
<project>
    <target name="clean">
        <delete dir="build"/>
    </target>

    <target name="compile">
        <mkdir dir="build/classes"/>
        <javac srcdir="src" destdir="build/classes"/>
    </target>

    <target name="jar">
        <mkdir dir="build/jar"/>
        <jar destfile="build/jar/HelloWorld.jar" basedir="build/classes">
            <manifest>
                <attribute name="Main-Class" value="oata.HelloWorld"/>
            </manifest>
        </jar>
    </target>

    <target name="run">
        <java jar="build/jar/HelloWorld.jar" fork="true"/>
    </target>

</project>
```

```xml
<mkdir dir="build/classes"/>
<javac
    srcdir="src"
    destdir="build/classes"/>
<!-- automatically detected -->
<!-- obsolete; done via manifest tag -->
<mkdir dir="build/jar"/>
<jar
    destfile="build/jar/HelloWorld.jar"

    basedir="build/classes">
    <manifest>
        <attribute name="Main-Class" value="oata.HelloWorld"/>
    </manifest>
</jar>
<java jar="build/jar/HelloWorld.jar" fork="true"/>
```


```xml
<project name="HelloWorld" basedir="." default="main">

    <property name="src.dir"     value="src"/>

    <property name="build.dir"   value="build"/>
    <property name="classes.dir" value="${build.dir}/classes"/>
    <property name="jar.dir"     value="${build.dir}/jar"/>

    <property name="main-class"  value="oata.HelloWorld"/>



    <target name="clean">
        <delete dir="${build.dir}"/>
    </target>

    <target name="compile">
        <mkdir dir="${classes.dir}"/>
        <javac srcdir="${src.dir}" destdir="${classes.dir}"/>
    </target>

    <target name="jar" depends="compile">
        <mkdir dir="${jar.dir}"/>
        <jar destfile="${jar.dir}/${ant.project.name}.jar" basedir="${classes.dir}">
            <manifest>
                <attribute name="Main-Class" value="${main-class}"/>
            </manifest>
        </jar>
    </target>

    <target name="run" depends="jar">
        <java jar="${jar.dir}/${ant.project.name}.jar" fork="true"/>
    </target>

    <target name="clean-build" depends="clean,jar"/>

    <target name="main" depends="clean,run"/>

</project>
```

```xml
<project name="HelloWorld" basedir="." default="main">
    ...
    <property name="lib.dir"     value="lib"/>

    <path id="classpath">
        <fileset dir="${lib.dir}" includes="**/*.jar"/>
    </path>

    ...

    <target name="compile">
        <mkdir dir="${classes.dir}"/>
        <javac srcdir="${src.dir}" destdir="${classes.dir}" classpathref="classpath"/>
    </target>

    <target name="run" depends="jar">
        <java fork="true" classname="${main-class}">
            <classpath>
                <path refid="classpath"/>
                <path location="${jar.dir}/${ant.project.name}.jar"/>
            </classpath>
        </java>
    </target>

    ...

</project>
```





References
----------
> [Tutorial: Hello World with Apache Ant](https://ant.apache.org/manual/tutorial-HelloWorldWithAnt.html "Tutorial: Hello World with Apache Ant"):
> [6. Resources](https://docs.spring.io/spring/docs/3.2.x/spring-framework-reference/html/resources.html "6. Resources"): 
> [Ant Tutorials](http://www.avajava.com/tutorials/categories/ant "Ant Tutorials"): Ant Tutorials
> []( "")
> []( "")
> []( "")
> []( "")
> []( "")
> []( "")
> []( "")
> []( "")
.....




