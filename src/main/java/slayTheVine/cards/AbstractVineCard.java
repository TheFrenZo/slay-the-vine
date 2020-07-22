package slayTheVine.cards;

import basemod.abstracts.CustomCard;

public abstract class AbstractVineCard extends CustomCard {
    public AbstractVineCard(String id, String name, String img, int cost, String description,
                            CardType type, CardColor color, CardRarity rarity, CardTarget target) {
        super(id, name, img, cost, description, type, color, rarity, target);
    }
}
