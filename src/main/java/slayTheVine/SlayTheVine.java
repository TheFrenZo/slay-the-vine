package slayTheVine;

import basemod.BaseMod;
import basemod.interfaces.*;
import com.badlogic.gdx.Gdx;
import com.evacipated.cardcrawl.modthespire.lib.SpireInitializer;
import com.megacrit.cardcrawl.cards.AbstractCard.CardColor;
import com.megacrit.cardcrawl.localization.CardStrings;
import org.apache.logging.log4j.LogManager;
import slayTheVine.cards.*;
import sun.nio.cs.StandardCharsets;

import java.util.logging.Logger;

@SpireInitializer
public class SlayTheVine implements EditCardsSubscriber, EditStringsSubscriber {

    public static final Logger logger = (Logger) LogManager.getLogger(SlayTheVine.class.getName());

    public static final CardColor VINE_COLOR = CardColor.COLORLESS;

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

    @Override
    public void receiveEditStrings() {
        logger.info("Editing strings...");

        BaseMod.loadCustomStringsFile(CardStrings.class, "localization/stv-cards.json");
    }
}
