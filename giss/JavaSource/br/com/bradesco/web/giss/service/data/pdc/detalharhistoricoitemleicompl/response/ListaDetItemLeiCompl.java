/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id$
 */

package br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.response;

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
 * Class ListaDetItemLeiCompl.
 * 
 * @version $Revision$ $Date$
 */
public class ListaDetItemLeiCompl implements java.io.Serializable {


      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codItemLei
     */
    private int _codItemLei = 0;

    /**
     * keeps track of state for field: _codItemLei
     */
    private boolean _has_codItemLei;

    /**
     * Field _codIndTipoManutencao
     */
    private java.lang.String _codIndTipoManutencao;

    /**
     * Field _descItemLei
     */
    private java.lang.String _descItemLei;

    /**
     * Field _dataInicioVigencia
     */
    private java.lang.String _dataInicioVigencia;

    /**
     * Field _dataFimVigencia
     */
    private java.lang.String _dataFimVigencia;

    /**
     * Field _codUsuarioManutencao
     */
    private java.lang.String _codUsuarioManutencao;

    /**
     * Field _dataHoraManutencao
     */
    private java.lang.String _dataHoraManutencao;


      //----------------/
     //- Constructors -/
    //----------------/

    public ListaDetItemLeiCompl() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.response.ListaDetItemLeiCompl()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteCodItemLei
     * 
     */
    public void deleteCodItemLei()
    {
        this._has_codItemLei= false;
    } //-- void deleteCodItemLei() 

    /**
     * Returns the value of field 'codIndTipoManutencao'.
     * 
     * @return String
     * @return the value of field 'codIndTipoManutencao'.
     */
    public java.lang.String getCodIndTipoManutencao()
    {
        return this._codIndTipoManutencao;
    } //-- java.lang.String getCodIndTipoManutencao() 

    /**
     * Returns the value of field 'codItemLei'.
     * 
     * @return int
     * @return the value of field 'codItemLei'.
     */
    public int getCodItemLei()
    {
        return this._codItemLei;
    } //-- int getCodItemLei() 

    /**
     * Returns the value of field 'codUsuarioManutencao'.
     * 
     * @return String
     * @return the value of field 'codUsuarioManutencao'.
     */
    public java.lang.String getCodUsuarioManutencao()
    {
        return this._codUsuarioManutencao;
    } //-- java.lang.String getCodUsuarioManutencao() 

    /**
     * Returns the value of field 'dataFimVigencia'.
     * 
     * @return String
     * @return the value of field 'dataFimVigencia'.
     */
    public java.lang.String getDataFimVigencia()
    {
        return this._dataFimVigencia;
    } //-- java.lang.String getDataFimVigencia() 

    /**
     * Returns the value of field 'dataHoraManutencao'.
     * 
     * @return String
     * @return the value of field 'dataHoraManutencao'.
     */
    public java.lang.String getDataHoraManutencao()
    {
        return this._dataHoraManutencao;
    } //-- java.lang.String getDataHoraManutencao() 

    /**
     * Returns the value of field 'dataInicioVigencia'.
     * 
     * @return String
     * @return the value of field 'dataInicioVigencia'.
     */
    public java.lang.String getDataInicioVigencia()
    {
        return this._dataInicioVigencia;
    } //-- java.lang.String getDataInicioVigencia() 

    /**
     * Returns the value of field 'descItemLei'.
     * 
     * @return String
     * @return the value of field 'descItemLei'.
     */
    public java.lang.String getDescItemLei()
    {
        return this._descItemLei;
    } //-- java.lang.String getDescItemLei() 

    /**
     * Method hasCodItemLei
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodItemLei()
    {
        return this._has_codItemLei;
    } //-- boolean hasCodItemLei() 

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
     * Sets the value of field 'codIndTipoManutencao'.
     * 
     * @param codIndTipoManutencao the value of field
     * 'codIndTipoManutencao'.
     */
    public void setCodIndTipoManutencao(java.lang.String codIndTipoManutencao)
    {
        this._codIndTipoManutencao = codIndTipoManutencao;
    } //-- void setCodIndTipoManutencao(java.lang.String) 

    /**
     * Sets the value of field 'codItemLei'.
     * 
     * @param codItemLei the value of field 'codItemLei'.
     */
    public void setCodItemLei(int codItemLei)
    {
        this._codItemLei = codItemLei;
        this._has_codItemLei = true;
    } //-- void setCodItemLei(int) 

    /**
     * Sets the value of field 'codUsuarioManutencao'.
     * 
     * @param codUsuarioManutencao the value of field
     * 'codUsuarioManutencao'.
     */
    public void setCodUsuarioManutencao(java.lang.String codUsuarioManutencao)
    {
        this._codUsuarioManutencao = codUsuarioManutencao;
    } //-- void setCodUsuarioManutencao(java.lang.String) 

    /**
     * Sets the value of field 'dataFimVigencia'.
     * 
     * @param dataFimVigencia the value of field 'dataFimVigencia'.
     */
    public void setDataFimVigencia(java.lang.String dataFimVigencia)
    {
        this._dataFimVigencia = dataFimVigencia;
    } //-- void setDataFimVigencia(java.lang.String) 

    /**
     * Sets the value of field 'dataHoraManutencao'.
     * 
     * @param dataHoraManutencao the value of field
     * 'dataHoraManutencao'.
     */
    public void setDataHoraManutencao(java.lang.String dataHoraManutencao)
    {
        this._dataHoraManutencao = dataHoraManutencao;
    } //-- void setDataHoraManutencao(java.lang.String) 

    /**
     * Sets the value of field 'dataInicioVigencia'.
     * 
     * @param dataInicioVigencia the value of field
     * 'dataInicioVigencia'.
     */
    public void setDataInicioVigencia(java.lang.String dataInicioVigencia)
    {
        this._dataInicioVigencia = dataInicioVigencia;
    } //-- void setDataInicioVigencia(java.lang.String) 

    /**
     * Sets the value of field 'descItemLei'.
     * 
     * @param descItemLei the value of field 'descItemLei'.
     */
    public void setDescItemLei(java.lang.String descItemLei)
    {
        this._descItemLei = descItemLei;
    } //-- void setDescItemLei(java.lang.String) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return ListaDetItemLeiCompl
     */
    public static br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.response.ListaDetItemLeiCompl unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.response.ListaDetItemLeiCompl) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.response.ListaDetItemLeiCompl.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.detalharhistoricoitemleicompl.response.ListaDetItemLeiCompl unmarshal(java.io.Reader) 

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
