package com.touwolf.mailchimp;

import org.junit.*;

public class MailchimpListsMembersTest {
    // To execute this test correctly, please fill real username and apikey
    private static final String USERNAME = "";

    private static final String API_KEY = "";

    public MailchimpListsMembersTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testSendgridRequest() throws Exception {

        try {
            /*MailchimpClient client = new MailchimpClientImpl(USERNAME, API_KEY);
            ListsMembers listsMembers = client.listsMembers();

            //Assert.assertNotNull(response);*/
        } catch (Exception ex) {
            Assert.assertTrue(false);
        }
    }

}
