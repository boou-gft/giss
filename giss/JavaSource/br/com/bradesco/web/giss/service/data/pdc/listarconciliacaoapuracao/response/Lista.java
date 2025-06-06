/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracao.response;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/

import java.io.IOException;
import java.io.Reader;
import java.io.Serializable;
import java.io.Writer;
import org.exolab.castor.xml.MarshalException;
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;
import org.exolab.castor.xml.ValidationException;
import org.xml.sax.ContentHandler;

/**
 * Class Lista.
 * 
 * @version $Revision$ $Date$
 */
public class Lista implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _cosif
     */
    private java.lang.String _cosif;

    /**
     * Field _grupoRazao
     */
    private int _grupoRazao = 0;

    /**
     * keeps track of state for field: _grupoRazao
     */
    private boolean _has_grupoRazao;

    /**
     * Field _subGrupoRazao
     */
    private int _subGrupoRazao = 0;

    /**
     * keeps track of state for field: _subGrupoRazao
     */
    private boolean _has_subGrupoRazao;

    /**
     * Field _conta
     */
    private int _conta = 0;

    /**
     * keeps track of state for field: _conta
     */
    private boolean _has_conta;

    /**
     * Field _digitoConta
     */
    private java.lang.String _digitoConta;

    /**
     * Field _descContaRazao
     */
    private java.lang.String _descContaRazao;

    /**
     * Field _sinalSaldoAnteriorCCRS
     */
    private java.lang.String _sinalSaldoAnteriorCCRS;

    /**
     * Field _valorSaldoAnteriorCCRS
     */
    private java.lang.String _valorSaldoAnteriorCCRS = "0";

    /**
     * Field _sinalDebitoCCRS
     */
    private java.lang.String _sinalDebitoCCRS;

    /**
     * Field _valorDebitoCCRS
     */
    private java.lang.String _valorDebitoCCRS = "0";

    /**
     * Field _sinalCreditoCCRS
     */
    private java.lang.String _sinalCreditoCCRS;

    /**
     * Field _valorCreditoCCRS
     */
    private java.lang.String _valorCreditoCCRS = "0";

    /**
     * Field _sinalSaldoAtualCCRS
     */
    private java.lang.String _sinalSaldoAtualCCRS;

    /**
     * Field _valorSaldoAtualCCRS
     */
    private java.lang.String _valorSaldoAtualCCRS = "0";

    /**
     * Field _sinalReceitaBalancete
     */
    private java.lang.String _sinalReceitaBalancete;

    /**
     * Field _valorReceitaBalancete
     */
    private java.lang.String _valorReceitaBalancete = "0";

    /**
     * Field _sinalReceitaGISS
     */
    private java.lang.String _sinalReceitaGISS;

    /**
     * Field _valorReceitaGISS
     */
    private java.lang.String _valorReceitaGISS = "0";

    /**
     * Field _sinalDifReceitaBalancete
     */
    private java.lang.String _sinalDifReceitaBalancete;

    /**
     * Field _valorDifReceitaBalancete
     */
    private java.lang.String _valorDifReceitaBalancete = "0";


      //----------------/
     //- Constructors -/
    //----------------/

    public Lista() 
     {
        super();
        setValorSaldoAnteriorCCRS("0");
        setValorDebitoCCRS("0");
        setValorCreditoCCRS("0");
        setValorSaldoAtualCCRS("0");
        setValorReceitaBalancete("0");
        setValorReceitaGISS("0");
        setValorDifReceitaBalancete("0");
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracao.response.Lista()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteConta
     * 
     */
    public void deleteConta()
    {
        this._has_conta= false;
    } //-- void deleteConta() 

    /**
     * Method deleteGrupoRazao
     * 
     */
    public void deleteGrupoRazao()
    {
        this._has_grupoRazao= false;
    } //-- void deleteGrupoRazao() 

    /**
     * Method deleteSubGrupoRazao
     * 
     */
    public void deleteSubGrupoRazao()
    {
        this._has_subGrupoRazao= false;
    } //-- void deleteSubGrupoRazao() 

    /**
     * Returns the value of field 'conta'.
     * 
     * @return int
     * @return the value of field 'conta'.
     */
    public int getConta()
    {
        return this._conta;
    } //-- int getConta() 

    /**
     * Returns the value of field 'cosif'.
     * 
     * @return String
     * @return the value of field 'cosif'.
     */
    public java.lang.String getCosif()
    {
        return this._cosif;
    } //-- java.lang.String getCosif() 

    /**
     * Returns the value of field 'descContaRazao'.
     * 
     * @return String
     * @return the value of field 'descContaRazao'.
     */
    public java.lang.String getDescContaRazao()
    {
        return this._descContaRazao;
    } //-- java.lang.String getDescContaRazao() 

    /**
     * Returns the value of field 'digitoConta'.
     * 
     * @return String
     * @return the value of field 'digitoConta'.
     */
    public java.lang.String getDigitoConta()
    {
        return this._digitoConta;
    } //-- java.lang.String getDigitoConta() 

    /**
     * Returns the value of field 'grupoRazao'.
     * 
     * @return int
     * @return the value of field 'grupoRazao'.
     */
    public int getGrupoRazao()
    {
        return this._grupoRazao;
    } //-- int getGrupoRazao() 

    /**
     * Returns the value of field 'sinalCreditoCCRS'.
     * 
     * @return String
     * @return the value of field 'sinalCreditoCCRS'.
     */
    public java.lang.String getSinalCreditoCCRS()
    {
        return this._sinalCreditoCCRS;
    } //-- java.lang.String getSinalCreditoCCRS() 

    /**
     * Returns the value of field 'sinalDebitoCCRS'.
     * 
     * @return String
     * @return the value of field 'sinalDebitoCCRS'.
     */
    public java.lang.String getSinalDebitoCCRS()
    {
        return this._sinalDebitoCCRS;
    } //-- java.lang.String getSinalDebitoCCRS() 

    /**
     * Returns the value of field 'sinalDifReceitaBalancete'.
     * 
     * @return String
     * @return the value of field 'sinalDifReceitaBalancete'.
     */
    public java.lang.String getSinalDifReceitaBalancete()
    {
        return this._sinalDifReceitaBalancete;
    } //-- java.lang.String getSinalDifReceitaBalancete() 

    /**
     * Returns the value of field 'sinalReceitaBalancete'.
     * 
     * @return String
     * @return the value of field 'sinalReceitaBalancete'.
     */
    public java.lang.String getSinalReceitaBalancete()
    {
        return this._sinalReceitaBalancete;
    } //-- java.lang.String getSinalReceitaBalancete() 

    /**
     * Returns the value of field 'sinalReceitaGISS'.
     * 
     * @return String
     * @return the value of field 'sinalReceitaGISS'.
     */
    public java.lang.String getSinalReceitaGISS()
    {
        return this._sinalReceitaGISS;
    } //-- java.lang.String getSinalReceitaGISS() 

    /**
     * Returns the value of field 'sinalSaldoAnteriorCCRS'.
     * 
     * @return String
     * @return the value of field 'sinalSaldoAnteriorCCRS'.
     */
    public java.lang.String getSinalSaldoAnteriorCCRS()
    {
        return this._sinalSaldoAnteriorCCRS;
    } //-- java.lang.String getSinalSaldoAnteriorCCRS() 

    /**
     * Returns the value of field 'sinalSaldoAtualCCRS'.
     * 
     * @return String
     * @return the value of field 'sinalSaldoAtualCCRS'.
     */
    public java.lang.String getSinalSaldoAtualCCRS()
    {
        return this._sinalSaldoAtualCCRS;
    } //-- java.lang.String getSinalSaldoAtualCCRS() 

    /**
     * Returns the value of field 'subGrupoRazao'.
     * 
     * @return int
     * @return the value of field 'subGrupoRazao'.
     */
    public int getSubGrupoRazao()
    {
        return this._subGrupoRazao;
    } //-- int getSubGrupoRazao() 

    /**
     * Returns the value of field 'valorCreditoCCRS'.
     * 
     * @return String
     * @return the value of field 'valorCreditoCCRS'.
     */
    public java.lang.String getValorCreditoCCRS()
    {
        return this._valorCreditoCCRS;
    } //-- java.lang.String getValorCreditoCCRS() 

    /**
     * Returns the value of field 'valorDebitoCCRS'.
     * 
     * @return String
     * @return the value of field 'valorDebitoCCRS'.
     */
    public java.lang.String getValorDebitoCCRS()
    {
        return this._valorDebitoCCRS;
    } //-- java.lang.String getValorDebitoCCRS() 

    /**
     * Returns the value of field 'valorDifReceitaBalancete'.
     * 
     * @return String
     * @return the value of field 'valorDifReceitaBalancete'.
     */
    public java.lang.String getValorDifReceitaBalancete()
    {
        return this._valorDifReceitaBalancete;
    } //-- java.lang.String getValorDifReceitaBalancete() 

    /**
     * Returns the value of field 'valorReceitaBalancete'.
     * 
     * @return String
     * @return the value of field 'valorReceitaBalancete'.
     */
    public java.lang.String getValorReceitaBalancete()
    {
        return this._valorReceitaBalancete;
    } //-- java.lang.String getValorReceitaBalancete() 

    /**
     * Returns the value of field 'valorReceitaGISS'.
     * 
     * @return String
     * @return the value of field 'valorReceitaGISS'.
     */
    public java.lang.String getValorReceitaGISS()
    {
        return this._valorReceitaGISS;
    } //-- java.lang.String getValorReceitaGISS() 

    /**
     * Returns the value of field 'valorSaldoAnteriorCCRS'.
     * 
     * @return String
     * @return the value of field 'valorSaldoAnteriorCCRS'.
     */
    public java.lang.String getValorSaldoAnteriorCCRS()
    {
        return this._valorSaldoAnteriorCCRS;
    } //-- java.lang.String getValorSaldoAnteriorCCRS() 

    /**
     * Returns the value of field 'valorSaldoAtualCCRS'.
     * 
     * @return String
     * @return the value of field 'valorSaldoAtualCCRS'.
     */
    public java.lang.String getValorSaldoAtualCCRS()
    {
        return this._valorSaldoAtualCCRS;
    } //-- java.lang.String getValorSaldoAtualCCRS() 

    /**
     * Method hasConta
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasConta()
    {
        return this._has_conta;
    } //-- boolean hasConta() 

    /**
     * Method hasGrupoRazao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasGrupoRazao()
    {
        return this._has_grupoRazao;
    } //-- boolean hasGrupoRazao() 

    /**
     * Method hasSubGrupoRazao
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasSubGrupoRazao()
    {
        return this._has_subGrupoRazao;
    } //-- boolean hasSubGrupoRazao() 

    /**
     * Method isValid
     * 
     * 
     * 
     * @return boolean
     */
    public boolean isValid()
    {
        try {
            validate();
        }
        catch (org.exolab.castor.xml.ValidationException vex) {
            return false;
        }
        return true;
    } //-- boolean isValid() 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param out
     */
    public void marshal(java.io.Writer out)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, out);
    } //-- void marshal(java.io.Writer) 

    /**
     * Method marshal
     * 
     * 
     * 
     * @param handler
     */
    public void marshal(org.xml.sax.ContentHandler handler)
        throws java.io.IOException, org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        
        Marshaller.marshal(this, handler);
    } //-- void marshal(org.xml.sax.ContentHandler) 

    /**
     * Sets the value of field 'conta'.
     * 
     * @param conta the value of field 'conta'.
     */
    public void setConta(int conta)
    {
        this._conta = conta;
        this._has_conta = true;
    } //-- void setConta(int) 

    /**
     * Sets the value of field 'cosif'.
     * 
     * @param cosif the value of field 'cosif'.
     */
    public void setCosif(java.lang.String cosif)
    {
        this._cosif = cosif;
    } //-- void setCosif(java.lang.String) 

    /**
     * Sets the value of field 'descContaRazao'.
     * 
     * @param descContaRazao the value of field 'descContaRazao'.
     */
    public void setDescContaRazao(java.lang.String descContaRazao)
    {
        this._descContaRazao = descContaRazao;
    } //-- void setDescContaRazao(java.lang.String) 

    /**
     * Sets the value of field 'digitoConta'.
     * 
     * @param digitoConta the value of field 'digitoConta'.
     */
    public void setDigitoConta(java.lang.String digitoConta)
    {
        this._digitoConta = digitoConta;
    } //-- void setDigitoConta(java.lang.String) 

    /**
     * Sets the value of field 'grupoRazao'.
     * 
     * @param grupoRazao the value of field 'grupoRazao'.
     */
    public void setGrupoRazao(int grupoRazao)
    {
        this._grupoRazao = grupoRazao;
        this._has_grupoRazao = true;
    } //-- void setGrupoRazao(int) 

    /**
     * Sets the value of field 'sinalCreditoCCRS'.
     * 
     * @param sinalCreditoCCRS the value of field 'sinalCreditoCCRS'
     */
    public void setSinalCreditoCCRS(java.lang.String sinalCreditoCCRS)
    {
        this._sinalCreditoCCRS = sinalCreditoCCRS;
    } //-- void setSinalCreditoCCRS(java.lang.String) 

    /**
     * Sets the value of field 'sinalDebitoCCRS'.
     * 
     * @param sinalDebitoCCRS the value of field 'sinalDebitoCCRS'.
     */
    public void setSinalDebitoCCRS(java.lang.String sinalDebitoCCRS)
    {
        this._sinalDebitoCCRS = sinalDebitoCCRS;
    } //-- void setSinalDebitoCCRS(java.lang.String) 

    /**
     * Sets the value of field 'sinalDifReceitaBalancete'.
     * 
     * @param sinalDifReceitaBalancete the value of field
     * 'sinalDifReceitaBalancete'.
     */
    public void setSinalDifReceitaBalancete(java.lang.String sinalDifReceitaBalancete)
    {
        this._sinalDifReceitaBalancete = sinalDifReceitaBalancete;
    } //-- void setSinalDifReceitaBalancete(java.lang.String) 

    /**
     * Sets the value of field 'sinalReceitaBalancete'.
     * 
     * @param sinalReceitaBalancete the value of field
     * 'sinalReceitaBalancete'.
     */
    public void setSinalReceitaBalancete(java.lang.String sinalReceitaBalancete)
    {
        this._sinalReceitaBalancete = sinalReceitaBalancete;
    } //-- void setSinalReceitaBalancete(java.lang.String) 

    /**
     * Sets the value of field 'sinalReceitaGISS'.
     * 
     * @param sinalReceitaGISS the value of field 'sinalReceitaGISS'
     */
    public void setSinalReceitaGISS(java.lang.String sinalReceitaGISS)
    {
        this._sinalReceitaGISS = sinalReceitaGISS;
    } //-- void setSinalReceitaGISS(java.lang.String) 

    /**
     * Sets the value of field 'sinalSaldoAnteriorCCRS'.
     * 
     * @param sinalSaldoAnteriorCCRS the value of field
     * 'sinalSaldoAnteriorCCRS'.
     */
    public void setSinalSaldoAnteriorCCRS(java.lang.String sinalSaldoAnteriorCCRS)
    {
        this._sinalSaldoAnteriorCCRS = sinalSaldoAnteriorCCRS;
    } //-- void setSinalSaldoAnteriorCCRS(java.lang.String) 

    /**
     * Sets the value of field 'sinalSaldoAtualCCRS'.
     * 
     * @param sinalSaldoAtualCCRS the value of field
     * 'sinalSaldoAtualCCRS'.
     */
    public void setSinalSaldoAtualCCRS(java.lang.String sinalSaldoAtualCCRS)
    {
        this._sinalSaldoAtualCCRS = sinalSaldoAtualCCRS;
    } //-- void setSinalSaldoAtualCCRS(java.lang.String) 

    /**
     * Sets the value of field 'subGrupoRazao'.
     * 
     * @param subGrupoRazao the value of field 'subGrupoRazao'.
     */
    public void setSubGrupoRazao(int subGrupoRazao)
    {
        this._subGrupoRazao = subGrupoRazao;
        this._has_subGrupoRazao = true;
    } //-- void setSubGrupoRazao(int) 

    /**
     * Sets the value of field 'valorCreditoCCRS'.
     * 
     * @param valorCreditoCCRS the value of field 'valorCreditoCCRS'
     */
    public void setValorCreditoCCRS(java.lang.String valorCreditoCCRS)
    {
        this._valorCreditoCCRS = valorCreditoCCRS;
    } //-- void setValorCreditoCCRS(java.lang.String) 

    /**
     * Sets the value of field 'valorDebitoCCRS'.
     * 
     * @param valorDebitoCCRS the value of field 'valorDebitoCCRS'.
     */
    public void setValorDebitoCCRS(java.lang.String valorDebitoCCRS)
    {
        this._valorDebitoCCRS = valorDebitoCCRS;
    } //-- void setValorDebitoCCRS(java.lang.String) 

    /**
     * Sets the value of field 'valorDifReceitaBalancete'.
     * 
     * @param valorDifReceitaBalancete the value of field
     * 'valorDifReceitaBalancete'.
     */
    public void setValorDifReceitaBalancete(java.lang.String valorDifReceitaBalancete)
    {
        this._valorDifReceitaBalancete = valorDifReceitaBalancete;
    } //-- void setValorDifReceitaBalancete(java.lang.String) 

    /**
     * Sets the value of field 'valorReceitaBalancete'.
     * 
     * @param valorReceitaBalancete the value of field
     * 'valorReceitaBalancete'.
     */
    public void setValorReceitaBalancete(java.lang.String valorReceitaBalancete)
    {
        this._valorReceitaBalancete = valorReceitaBalancete;
    } //-- void setValorReceitaBalancete(java.lang.String) 

    /**
     * Sets the value of field 'valorReceitaGISS'.
     * 
     * @param valorReceitaGISS the value of field 'valorReceitaGISS'
     */
    public void setValorReceitaGISS(java.lang.String valorReceitaGISS)
    {
        this._valorReceitaGISS = valorReceitaGISS;
    } //-- void setValorReceitaGISS(java.lang.String) 

    /**
     * Sets the value of field 'valorSaldoAnteriorCCRS'.
     * 
     * @param valorSaldoAnteriorCCRS the value of field
     * 'valorSaldoAnteriorCCRS'.
     */
    public void setValorSaldoAnteriorCCRS(java.lang.String valorSaldoAnteriorCCRS)
    {
        this._valorSaldoAnteriorCCRS = valorSaldoAnteriorCCRS;
    } //-- void setValorSaldoAnteriorCCRS(java.lang.String) 

    /**
     * Sets the value of field 'valorSaldoAtualCCRS'.
     * 
     * @param valorSaldoAtualCCRS the value of field
     * 'valorSaldoAtualCCRS'.
     */
    public void setValorSaldoAtualCCRS(java.lang.String valorSaldoAtualCCRS)
    {
        this._valorSaldoAtualCCRS = valorSaldoAtualCCRS;
    } //-- void setValorSaldoAtualCCRS(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Lista
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracao.response.Lista unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracao.response.Lista) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracao.response.Lista.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracao.response.Lista unmarshal(java.io.Reader) 

    /**
     * Method validate
     * 
     */
    public void validate()
        throws org.exolab.castor.xml.ValidationException
    {
        org.exolab.castor.xml.Validator validator = new org.exolab.castor.xml.Validator();
        validator.validate(this);
    } //-- void validate() 

}
