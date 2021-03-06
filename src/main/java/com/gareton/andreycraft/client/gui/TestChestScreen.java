package com.gareton.andreycraft.client.gui;

import com.gareton.andreycraft.AndreyCraft;
import com.gareton.andreycraft.container.TestChestContainer;
import com.mojang.blaze3d.systems.RenderSystem;

import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;

public class TestChestScreen extends ContainerScreen<TestChestContainer> {

	private static final ResourceLocation background_texture = new ResourceLocation(AndreyCraft.MOD_ID, "textures/gui/test_chest.png");
	
	public TestChestScreen(TestChestContainer screenContainer, PlayerInventory inv, ITextComponent titleIn) {
		super(screenContainer, inv, titleIn);
		this.guiLeft = 0;
		this.guiTop = 0;
		this.xSize = 175;
		this.ySize = 183;
	}
	
	@Override
	public void render(final int mouseX, final int mouseY, final float paritalTicks) {
		this.renderBackground();
		super.render(mouseX, mouseY, paritalTicks);
		this.renderHoveredToolTip(mouseX, mouseY);
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		super.drawGuiContainerForegroundLayer(mouseX, mouseY);
		this.font.drawString(this.title.getFormattedText(), 8.0f, 6.0f, 4210752);
		this.font.drawString(this.playerInventory.getDisplayName().getFormattedText(), 8.0f, 90.0f, 4210752);
	}
	
	@Override
	protected void drawGuiContainerBackgroundLayer(float parialTicks, int mouseX, int mouseY) {
		RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
		this.minecraft.getTextureManager().bindTexture(background_texture);
		int x = (this.width - this.xSize) / 2;
		int y = (this.height - this.ySize) / 2;
		this.blit(x, y, 0, 0, this.xSize, this.ySize);
	}
}
