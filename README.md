# Micro Profile - Samples

## Purpose of these samples

Give different samples on the Micro Profile : 

* **Canonical** Simplest sample using JAX-RS / CDI / JSon-P 
* **Swagger** Adding Swagger to the canonical sample 

## Testing

These examples use Arquillian Tests. By default, Arquillian uses WildFly embedded, but other forms of containers can also be plugged in.
 
* `mvn clean test` (or `mvn clean test -P arquillian-wildfly-managed`)  tests against an embedded WildFly
* `mvn clean test -P arquillian-wildfly-remote` tests against a running WildFly
* `mvn clean test` (or `mvn clean test -P arquillian-tomee-managed`)  tests against an embedded Apache TomEE
* `mvn clean test -P arquillian-tomee-remote` tests against a remote Apache TomEE
