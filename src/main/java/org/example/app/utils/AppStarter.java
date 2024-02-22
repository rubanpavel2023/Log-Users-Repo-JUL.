package org.example.app.utils;

import java.util.logging.*;
import org.example.app.controller.AppController;
import org.example.app.database.DBConn;
import org.example.app.service.AppService;
import org.example.app.view.AppView;

public class AppStarter {

    private static final Logger logger = Logger.getLogger(AppStarter.class.getName());

    static {
        try {
            FileHandler fileHandler = new FileHandler("app.log", true);

            SimpleFormatter formatter = new SimpleFormatter();

            fileHandler.setFormatter(formatter);

            logger.addHandler(fileHandler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void startApp() {
        logger.info("Starting the application..");
        DBConn.createNewTable();
        AppService service = new AppService();
        AppView view = new AppView();

        logger.info(" initialized. Running the application...");
        AppController controller = new AppController(view, service);
        controller.runApp();
        logger.info("Application has started successfully.");
    }
}
