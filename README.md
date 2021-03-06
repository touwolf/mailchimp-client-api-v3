[![Build Status](https://travis-ci.org/touwolf/mailchimp-client-api-v3.svg?branch=master)](https://travis-ci.org/touwolf/mailchimp-client-api-v3) 
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.touwolf/touwolf-mailchimp-v3/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.touwolf/touwolf-mailchimp-v3/bridje-parent)
[![Codacy Badge](https://api.codacy.com/project/badge/Grade/1c03ea10342e49abba9eee59251440de)](https://www.codacy.com/app/acksecurity/mailchimp-client-api-v3?utm_source=github.com&amp;utm_medium=referral&amp;utm_content=touwolf/mailchimp-client-api-v3&amp;utm_campaign=Badge_Grade)


# Mailchimp Client API V3

Mailchimp Client API V3 wrapper for **Java**

Implemented API
==============

API Root

Batch Operations

Campaign Folders

Campaigns

    Content
    Feedback
    Send Checklist



Lists

    Abuse Reports
    Activity
    Clients
    Growth History
    Interest Categories
    Members
    Merge Fields
    Segments
    Webhooks

Usage
=====

* Add dependency

*Maven*
```
<dependency>
    <groupId>com.touwolf</groupId>
    <artifactId>touwolf-mailchimp-v3</artifactId>
    <version>0.0.7</version>
</dependency>
```

*Gradle*
```
compile 'com.touwolf:touwolf-mailchimp-v3:0.0.7'
```

* Code

```java
MailchimpClient mailchimpClient = new MailchimpClientImpl(MY_USER, MY_API_KEY);
Lists lists = mailchimpClient.lists();
...
// returns all the list on mailchimp
MailchimpResponse<ListsReadResponse> response = lists.read(new ListsReadRequest());
...
```
Dependencies
============

Bridje Core IoC library https://github.com/bridje/bridje-framework/wiki/Bridje-IoC

        <dependency>
            <groupId>org.bridje</groupId>
            <artifactId>bridje-ioc</artifactId>
            <version>0.2.2</version>
        </dependency>
        

HTTP & HTTP/2 client for Android and Java applications https://github.com/square/okhttp/wiki

          <dependency>
            <groupId>com.squareup.okhttp3</groupId>
            <artifactId>okhttp</artifactId>
            <version>3.3.1</version>
        </dependency>
        

Java library that can be used to convert Java Objects into their JSON representation https://github.com/google/gson

        <dependency>
            <groupId>com.google.code.gson</groupId>
            <artifactId>gson</artifactId>
            <version>2.4</version>
        </dependency>


--

The project is licensed under the MIT License:

The MIT License (MIT)

Copyright (c) 2016 Touwolf Technologies

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
