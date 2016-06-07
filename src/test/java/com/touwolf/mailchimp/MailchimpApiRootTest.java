
package com.touwolf.mailchimp;
import com.touwolf.mailchimp.impl.MailchimpClientImpl;
import com.touwolf.mailchimp.model.MailchimpResponse;
import com.touwolf.mailchimp.model.apiroot.data.ApiRootResponse;
import org.junit.*;

public class MailchimpApiRootTest
{
    // To execute this test correctly, please fill real username and apikey
    private static final String USERNAME = "";

    private static final String API_KEY = "";

    public MailchimpApiRootTest()
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
            MailchimpResponse<ApiRootResponse> apiRoot = client.apiRoot().read();
            Assert.assertNotNull(apiRoot);
        }
        catch (Exception ex)
        {
            Assert.assertTrue(false);
        }
    }

}
