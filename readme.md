# Read me

## compile

~/Spikespaces/java9/resource
$ javac -d target/classes src/main/java/it/nipe/java9/ResourceLoader.java 

## build

~/Spikespaces/java9/resource
$ jar --create --file target/javanove.jar --main-class it.nipe.java9.ResourceLoader -C target/classes .

## run

~/Spikespaces/java9/resource
$ java --module-path target/javanove.jar --module it.nipe.java9
Java version:9.0.1
jar:file:///home/nipe/Spikespaces/java9/resource/target/javanove.jar!/test.txt

## output

Java version:9.0.1
jar:file:///home/nipe/Spikespaces/java9/resource/target/javanove.jar!/test.txt

## link

~/Spikespaces/java9/resource
$ jlink --module-path $JAVA_HOME/jmods/:target/javanove.jar --add-modules it.nipe.java9 --limit-modules it.nipe.java9 --output outputdir 

## check link modules

~/Spikespaces/java9/resource
$ outputdir/bin/java --list-modules
it.nipe.java9
java.base@9.0.1

## run linked version

~/Spikespaces/java9/resource
$ outputdir/bin/java -m it.nipe.java9/it.nipe.java9.ResourceLoader
Java version:9.0.1
jrt:/it.nipe.java9/test.txt
