package game;


import java.io.Serializable;

public interface ValidateResult extends Serializable
{
    public String getInvalidReason();
    public boolean isValid();
}
