/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracaoloop.response;

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
    private java.lang.String _grupoRazao = "0";

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
    private double _valorSaldoAnteriorCCRS = 0;

    /**
     * keeps track of state for field: _valorSaldoAnteriorCCRS
     */
    private boolean _has_valorSaldoAnteriorCCRS;

    /**
     * Field _sinalDebitoCCRS
     */
    private java.lang.String _sinalDebitoCCRS;

    /**
     * Field _valorDebitoCCRS
     */
    private double _valorDebitoCCRS = 0;

    /**
     * keeps track of state for field: _valorDebitoCCRS
     */
    private boolean _has_valorDebitoCCRS;

    /**
     * Field _sinalCreditoCCRS
     */
    private java.lang.String _sinalCreditoCCRS;

    /**
     * Field _valorCreditoCCRS
     */
    private double _valorCreditoCCRS = 0;

    /**
     * keeps track of state for field: _valorCreditoCCRS
     */
    private boolean _has_valorCreditoCCRS;

    /**
     * Field _sinalSaldoAtualCCRS
     */
    private java.lang.String _sinalSaldoAtualCCRS;

    /**
     * Field _valorSaldoAtualCCRS
     */
    private double _valorSaldoAtualCCRS = 0;

    /**
     * keeps track of state for field: _valorSaldoAtualCCRS
     */
    private boolean _has_valorSaldoAtualCCRS;

    /**
     * Field _sinalReceitaBalancete
     */
    private java.lang.String _sinalReceitaBalancete;

    /**
     * Field _valorReceitaBalancete
     */
    private double _valorReceitaBalancete = 0;

    /**
     * keeps track of state for field: _valorReceitaBalancete
     */
    private boolean _has_valorReceitaBalancete;

    /**
     * Field _sinalReceitaGISS
     */
    private java.lang.String _sinalReceitaGISS;

    /**
     * Field _valorReceitaGISS
     */
    private double _valorReceitaGISS = 0;

    /**
     * keeps track of state for field: _valorReceitaGISS
     */
    private boolean _has_valorReceitaGISS;

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
        setGrupoRazao("0");
        setValorDifReceitaBalancete("0");
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracaoloop.response.Lista()


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
     * Method deleteSubGrupoRazao
     * 
     */
    public void deleteSubGrupoRazao()
    {
        this._has_subGrupoRazao= false;
    } //-- void deleteSubGrupoRazao() 

    /**
     * Method deleteValorCreditoCCRS
     * 
     */
    public void deleteValorCreditoCCRS()
    {
        this._has_valorCreditoCCRS= false;
    } //-- void deleteValorCreditoCCRS() 

    /**
     * Method deleteValorDebitoCCRS
     * 
     */
    public void deleteValorDebitoCCRS()
    {
        this._has_valorDebitoCCRS= false;
    } //-- void deleteValorDebitoCCRS() 

    /**
     * Method deleteValorReceitaBalancete
     * 
     */
    public void deleteValorReceitaBalancete()
    {
        this._has_valorReceitaBalancete= false;
    } //-- void deleteValorReceitaBalancete() 

    /**
     * Method deleteValorReceitaGISS
     * 
     */
    public void deleteValorReceitaGISS()
    {
        this._has_valorReceitaGISS= false;
    } //-- void deleteValorReceitaGISS() 

    /**
     * Method deleteValorSaldoAnteriorCCRS
     * 
     */
    public void deleteValorSaldoAnteriorCCRS()
    {
        this._has_valorSaldoAnteriorCCRS= false;
    } //-- void deleteValorSaldoAnteriorCCRS() 

    /**
     * Method deleteValorSaldoAtualCCRS
     * 
     */
    public void deleteValorSaldoAtualCCRS()
    {
        this._has_valorSaldoAtualCCRS= false;
    } //-- void deleteValorSaldoAtualCCRS() 

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
     * @return String
     * @return the value of field 'grupoRazao'.
     */
    public java.lang.String getGrupoRazao()
    {
        return this._grupoRazao;
    } //-- java.lang.String getGrupoRazao() 

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
     * @return double
     * @return the value of field 'valorCreditoCCRS'.
     */
    public double getValorCreditoCCRS()
    {
        return this._valorCreditoCCRS;
    } //-- double getValorCreditoCCRS() 

    /**
     * Returns the value of field 'valorDebitoCCRS'.
     * 
     * @return double
     * @return the value of field 'valorDebitoCCRS'.
     */
    public double getValorDebitoCCRS()
    {
        return this._valorDebitoCCRS;
    } //-- double getValorDebitoCCRS() 

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
     * @return double
     * @return the value of field 'valorReceitaBalancete'.
     */
    public double getValorReceitaBalancete()
    {
        return this._valorReceitaBalancete;
    } //-- double getValorReceitaBalancete() 

    /**
     * Returns the value of field 'valorReceitaGISS'.
     * 
     * @return double
     * @return the value of field 'valorReceitaGISS'.
     */
    public double getValorReceitaGISS()
    {
        return this._valorReceitaGISS;
    } //-- double getValorReceitaGISS() 

    /**
     * Returns the value of field 'valorSaldoAnteriorCCRS'.
     * 
     * @return double
     * @return the value of field 'valorSaldoAnteriorCCRS'.
     */
    public double getValorSaldoAnteriorCCRS()
    {
        return this._valorSaldoAnteriorCCRS;
    } //-- double getValorSaldoAnteriorCCRS() 

    /**
     * Returns the value of field 'valorSaldoAtualCCRS'.
     * 
     * @return double
     * @return the value of field 'valorSaldoAtualCCRS'.
     */
    public double getValorSaldoAtualCCRS()
    {
        return this._valorSaldoAtualCCRS;
    } //-- double getValorSaldoAtualCCRS() 

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
     * Method hasValorCreditoCCRS
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorCreditoCCRS()
    {
        return this._has_valorCreditoCCRS;
    } //-- boolean hasValorCreditoCCRS() 

    /**
     * Method hasValorDebitoCCRS
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorDebitoCCRS()
    {
        return this._has_valorDebitoCCRS;
    } //-- boolean hasValorDebitoCCRS() 

    /**
     * Method hasValorReceitaBalancete
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorReceitaBalancete()
    {
        return this._has_valorReceitaBalancete;
    } //-- boolean hasValorReceitaBalancete() 

    /**
     * Method hasValorReceitaGISS
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorReceitaGISS()
    {
        return this._has_valorReceitaGISS;
    } //-- boolean hasValorReceitaGISS() 

    /**
     * Method hasValorSaldoAnteriorCCRS
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorSaldoAnteriorCCRS()
    {
        return this._has_valorSaldoAnteriorCCRS;
    } //-- boolean hasValorSaldoAnteriorCCRS() 

    /**
     * Method hasValorSaldoAtualCCRS
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasValorSaldoAtualCCRS()
    {
        return this._has_valorSaldoAtualCCRS;
    } //-- boolean hasValorSaldoAtualCCRS() 

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
    public void setGrupoRazao(java.lang.String grupoRazao)
    {
        this._grupoRazao = grupoRazao;
    } //-- void setGrupoRazao(java.lang.String) 

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
    public void setValorCreditoCCRS(double valorCreditoCCRS)
    {
        this._valorCreditoCCRS = valorCreditoCCRS;
        this._has_valorCreditoCCRS = true;
    } //-- void setValorCreditoCCRS(double) 

    /**
     * Sets the value of field 'valorDebitoCCRS'.
     * 
     * @param valorDebitoCCRS the value of field 'valorDebitoCCRS'.
     */
    public void setValorDebitoCCRS(double valorDebitoCCRS)
    {
        this._valorDebitoCCRS = valorDebitoCCRS;
        this._has_valorDebitoCCRS = true;
    } //-- void setValorDebitoCCRS(double) 

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
    public void setValorReceitaBalancete(double valorReceitaBalancete)
    {
        this._valorReceitaBalancete = valorReceitaBalancete;
        this._has_valorReceitaBalancete = true;
    } //-- void setValorReceitaBalancete(double) 

    /**
     * Sets the value of field 'valorReceitaGISS'.
     * 
     * @param valorReceitaGISS the value of field 'valorReceitaGISS'
     */
    public void setValorReceitaGISS(double valorReceitaGISS)
    {
        this._valorReceitaGISS = valorReceitaGISS;
        this._has_valorReceitaGISS = true;
    } //-- void setValorReceitaGISS(double) 

    /**
     * Sets the value of field 'valorSaldoAnteriorCCRS'.
     * 
     * @param valorSaldoAnteriorCCRS the value of field
     * 'valorSaldoAnteriorCCRS'.
     */
    public void setValorSaldoAnteriorCCRS(double valorSaldoAnteriorCCRS)
    {
        this._valorSaldoAnteriorCCRS = valorSaldoAnteriorCCRS;
        this._has_valorSaldoAnteriorCCRS = true;
    } //-- void setValorSaldoAnteriorCCRS(double) 

    /**
     * Sets the value of field 'valorSaldoAtualCCRS'.
     * 
     * @param valorSaldoAtualCCRS the value of field
     * 'valorSaldoAtualCCRS'.
     */
    public void setValorSaldoAtualCCRS(double valorSaldoAtualCCRS)
    {
        this._valorSaldoAtualCCRS = valorSaldoAtualCCRS;
        this._has_valorSaldoAtualCCRS = true;
    } //-- void setValorSaldoAtualCCRS(double) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return Lista
     */
    public static br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracaoloop.response.Lista unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracaoloop.response.Lista) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracaoloop.response.Lista.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.listarconciliacaoapuracaoloop.response.Lista unmarshal(java.io.Reader) 

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
