KieaAnt
=======
Ant project informations

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

References
----------
> [Tutorial: Hello World with Apache Ant](https://ant.apache.org/manual/tutorial-HelloWorldWithAnt.html "Tutorial: Hello World with Apache Ant")
> []( "")
> []( "")
> []( "")
> []( "")
> []( "")
> []( "")
> []( "")
> []( "")
> []( "")
> []( "")
.....




