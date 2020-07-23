package slayTheVine;

import basemod.BaseMod;
import basemod.interfaces.*;
import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer;
import org.apache.logging.log4j.LogManager;
import slayTheVine.cards.*;

import java.util.logging.Logger;

@SpireInitializer
public class SlayTheVine implements EditCardsSubscriber {

    public static final Logger logger = (Logger) LogManager.getLogger(SlayTheVine.class.getName());

    public SlayTheVine() {
        logger.info("Subscribing...");
        BaseMod.subscribe(this);
    }

    @SuppressWarnings("unused")
    public static void initialize() {
        logger.info("initializing Slay The Vine; please hold...");
        SlayTheVine slayTheVine = new SlayTheVine();
    }

    @Override
    public void receiveEditCards() {
        logger.info("Adding cards...");
        BaseMod.addCard(new ZipZoom());
    }
}
