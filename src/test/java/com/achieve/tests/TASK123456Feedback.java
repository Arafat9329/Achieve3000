//package com.achieve.tests;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.ITestContext;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import java.util.ArrayList;
//import java.util.Map;
//import java.util.concurrent.TimeUnit;
//
//public class TASK123456 extends UGHTest {
    //FIXME:
    // - base on my understanding, this code about
    // - login with correct credentials
    // - save(get) the URL
    // - logout and open the URL we just save
    // - login with wrong credentials
    // - make sure error message displayed.
    // - =====Feedback:====
    // - 1.there is no any comment for any code or methode and it is really hard to read.
    // - 2.since I don't  have full code, some of code I'm not sure its missing or it is on parent class(UGHTest).
    // - 3.set up driver should be in @BeforeMethod
    // - 4.other coding mistake i point out in the code.
//
//
//
//    String currentURL = "";
//    public static String myProgram = "MyProgram";
//    static String[] access = new String[3];
//
//
//    public static void myIni(ITestContext context)//FIXME:curly brackets is missing.
//    try{
//            String[] str = context.getCurrentXmlTest().getParameter("knownIssues").split(";");
//
//            for (int i = 0; i < str.length; i++) {
//                knownIssues.add(str[i]);
//            }
//
//            flag_single_sign_on_url = context.getCurrentXmlTest().getParameter("flag_single_sign_on_url");
//        }catch(Exception e){
//            System.out.print("\n error:" + e.getMessage());
//        }
//
//}
//
//    @DataProvider(name = "validLogins", parallel = false)//FIXME: why parallel be false?
//    public static Object[][] credentials(ITestContext context) {
//        myIni(context);
//        try {
//
//            Map<String, Map<String, Object>> items = AdminUserConfig.getAdmins("src/data.yml");
//
//            String[][] usersInfo = new String[3][3];
//            ArrayList<Integer> alreadyUsedSubscriberType = new ArrayList();
//            int i = 0;
//            for (String key : items.keySet()) {
//
//                Map<String, Object> user = (Map<String, Object>) items.get(key);
//
//                if (((String) user.get("scenario")).equals("valid") && !alreadyUsedSubscriberType.contains(user.get("subscriberType")) && false) {//FIXME: if statement will always be false(I'm not sure this is bug or future)
//                    alreadyUsedSubscriberType.add((Integer) user.get("subscriberType"));
//                    usersInfo[i][0] = (String) user.get("username");
//                    usersInfo[i][1] = (String) user.get("password");
//                    Integer subscriberType = (Integer) user.get("subscriberType");
//                    usersInfo[i][2] = subscriberType.intValue() + "";
//                    i++;
//
//                }
//            }
//
//
//            for (String key : items.keySet()) {
//
//                Map<String, Object> user = (Map<String, Object>) items.get(key);
//
//                if (((String) user.get("scenario")).equals("anotherAdmin")) {
//
//                    access[0] = (String) user.get("username");
//                    access[1] = (String) user.get("password");
//                    Integer subscriberType = (Integer) user.get("subscriberType");
//                    access[2] = subscriberType.intValue() + "";
//                    i++;
//
//                }
//            }
//
//            int numberOfTests = 1; // or = i;//FIXME:- why number of tests is hardcoded? it must be equals to the size of tests list.
//            String[][] usersInfo2 = new String[numberOfTests][3];
//            System.arraycopy(usersInfo, 0, usersInfo2, 0, numberOfTests);//FIXME:im not sure this going to work on 2dArrays
//
//            return usersInfo2;
//        } catch (Exception e) {
//            System.out.println(e);
//        }
//        return null;//FIXME:it’s a bad idea to return null, because not informative. It’s better to throw specific runtime exception with a message
//
//    }
//
//
//    @Test(dataProvider = "validLogins", groups = "Regression Test")
//    public void loginAsDaOrSaFromAnotherDistrict(String uid, String pwd, String customer_type) throws InterruptedException, Exception {//FIXME: it's better to handle "throws exception" with try catch
//        //Test 12344
//        String methodName = Thread.currentThread().getStackTrace()[1].getMethodName() + uid;
//        ini(methodName);
//        WebDriver driver = driverList.get(methodName);
//        WebDriverWait wait = new WebDriverWait(driver, waitInterval);
//        waitList.get(methodName);
//        //FIXME: above code should be in @BeforeMethod
//
//
//        loginUGH(uid, pwd, customer_type, driver, methodName);
//
//        new IndicatorCards(driver, waitInterval, codeBase);//FIXME: it’s better to create reference variables for objects to be able to reuse them
//        UserPage userPage = new UserPage(driver, waitInterval);
//        userPage.waitInterval = waitInterval;
//
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//FIXME: should be in @BeforeMethod
                                                                          // FIXME: it’s not recommended to use implicit and explicit wait together since it leads to extra waits.
//        userPage.openFilterPanel(driver, methodName);
//        Filters filtersPage = userPage.getFilters(methodName, driver, waitInterval, knownIssues, forceDateRangeInd forceDateRangeValue, true, forceSchoolYearValue);
//        filtersPage.setUpFilters(customer_type, methodName);
//        BestPage bestPage = new BestPage(methodName, driver, waitInterval, codeBase, knownIssues, forceDateRangeInd, forceDateRangeValue);
//        currentURL = bestPage.getMark(methodName, filtersPage);
//        userPage.waitInterval = waitInterval;
//        userPage.logOut(driver, methodName, waitInterval);//FIXME: wait interval set twice?
//
//
//        userPage.useBestPageFromUserFromAnotherPlace(currentURL, driver);
//
//        loginUGHLight(access[0], access[1], "skip", driver, methodName);//FIXME:why skip status is hardcoded? Status must be retrieved prom ItestResult: ItestResult.getStatus()
//        //	wait.until(ExpectedConditions.visibilityOf(bestPage.popup3));
//        //	wait.until(ExpectedConditions.visibilityOf(bestPage.popup4));
//
//        wait.until(ExpectedConditions.visibilityOf(bestPage.popup2));
//        Assert.assertTrue(elementIsDisplayed(new WebElement[]{bestPage.popup2}), "Permission Denied popup is missing");
//
//    }
//
//}
//
