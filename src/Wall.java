import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wall implements Structure {
    private List<Block> blocks;

    public Wall(CompositeBlock compositeBlock) {
        this.blocks = compositeBlock.getBlocks();
    }

    @Override
    public Optional<Block> findBlockByColor(String color) {
        return blocks.stream().findAny().filter(block -> Objects.equals(block.getColor(), color));
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return blocks.stream().filter(block -> Objects.equals(block.getMaterial(), material)).collect(Collectors.toList());
    }

    @Override
    public int count() {
        return blocks.size();
    }
}
