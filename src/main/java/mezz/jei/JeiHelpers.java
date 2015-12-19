package mezz.jei;

import mezz.jei.api.IGuiHelper;
import mezz.jei.api.IItemBlacklist;
import mezz.jei.api.IJeiHelpers;
import mezz.jei.api.INbtIgnoreList;
import mezz.jei.api.JEIManager;
import mezz.jei.gui.GuiHelper;

public class JeiHelpers implements IJeiHelpers {
	private final IGuiHelper guiHelper;
	private final IItemBlacklist itemBlacklist;
	private final INbtIgnoreList nbtIgnoreList;

	public JeiHelpers() {
		this.guiHelper = JEIManager.guiHelper = new GuiHelper();
		this.itemBlacklist = JEIManager.itemBlacklist = new ItemBlacklist();
		this.nbtIgnoreList = JEIManager.nbtIgnoreList = new NbtIgnoreList();
	}

	@Override
	public IGuiHelper getGuiHelper() {
		return guiHelper;
	}

	@Override
	public IItemBlacklist getItemBlacklist() {
		return itemBlacklist;
	}

	@Override
	public INbtIgnoreList getNbtIgnoreList() {
		return nbtIgnoreList;
	}
}