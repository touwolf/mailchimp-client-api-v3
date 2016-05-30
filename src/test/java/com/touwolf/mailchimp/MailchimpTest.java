package com.touwolf.mailchimp;

import com.touwolf.mailchimp.impl.MailchimpClientImpl;
import org.junit.*;

public class MailchimpTest
{
    private static final String API_KEY = "";

    public MailchimpTest()
    {
    }

    @BeforeClass
    public static void setUpClass()
    {
    }

    @AfterClass
    public static void tearDownClass()
    {
    }

    @Before
    public void setUp()
    {
    }

    @After
    public void tearDown()
    {
    }

    @Test
    public void testSendgridRequest() throws Exception
    {

        try
        {
            MailchimpClient client = new MailchimpClientImpl(API_KEY);
        }
        catch (Exception ex)
        {
            Assert.assertTrue(false);
        }
    }
}
