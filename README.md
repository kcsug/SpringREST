Spring REST
-----------
This repository contains samples of using Spring to create REST APIs. These are used in the "Giving Spring some REST" talk that I have been presenting on the NFJS tour.

Included here:

 * trips-service : A very basic Spring MVC-driven API using Spring Data JPA to persist data to an embedded H2 database.
 * trips-service-sdr : The same (more or less) API, only using Spring Data REST to expose the Spring Data JPA-created repository as a REST service. (Note the addition of the Spring Data REST starter in the build and the removal of the controller.)
 * trips-secured : The Spring MVC-driven API, OAuth2-secured with Spring Security for OAuth.
 * trips-secured-sdr : An OAuth2-secured, Spring Data REST-exposed service. Note that (at this time) there's no clear way to pass the authorizing user details into a repository method. So OAuth2-security is limited to enforcing scopes and authorization.

Enjoy
