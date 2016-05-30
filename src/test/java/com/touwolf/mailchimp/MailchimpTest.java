
package com.touwolf.mailchimp;
import com.touwolf.mailchimp.impl.MailchimpClientImpl;
import com.touwolf.mailchimp.model.apiroot.ApiRootResponse;
import org.junit.*;

public class MailchimpTest
{
    // To execute this test correctly, please fill real username and password values
    private static final String USERNAME = "";

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
            MailchimpClient client = new MailchimpClientImpl(USERNAME, API_KEY);
            ApiRootResponse apiRoot = client.getApiRoot();
            Assert.assertNotNull(apiRoot);
        }
        catch (Exception ex)
        {
            Assert.assertTrue(false);
        }
    }

}
