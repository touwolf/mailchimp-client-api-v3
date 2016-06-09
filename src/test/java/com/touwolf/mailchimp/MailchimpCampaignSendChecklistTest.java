package com.touwolf.mailchimp;

import com.touwolf.mailchimp.api.campaign.Campaign;
import com.touwolf.mailchimp.api.campaign.CampaignSendChecklist;
import com.touwolf.mailchimp.data.MailchimpResponse;
import com.touwolf.mailchimp.impl.MailchimpClientImpl;
import com.touwolf.mailchimp.model.campaign.CampaignReadRequest;
import com.touwolf.mailchimp.model.campaign.CampaignReadResponse;
import org.junit.*;

public class MailchimpCampaignSendChecklistTest {
    // To execute this test correctly, please fill real username and apikey
    private static final String USERNAME = "";

    private static final String API_KEY = "";

    public MailchimpCampaignSendChecklistTest() {
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
            MailchimpClient client = new MailchimpClientImpl(USERNAME, API_KEY);
            CampaignSendChecklist campaignSendChecklist = client.campaignSendChecklist();

            //Assert.assertNotNull(response);
        } catch (Exception ex) {
            Assert.assertTrue(false);
        }
    }

}
