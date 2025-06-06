/*
 * This class was automatically generated with 
 * <a href="http://www.castor.org">Castor 1.0</a>, using an XML
 * Schema.
 * $Id: AtualizarAliquotaRequest.java,v 1.1 2017/04/11 14:10:57 gmichelini Exp $
 */

package br.com.bradesco.web.giss.service.data.pdc.atualizaraliquota.request;

  //---------------------------------/
 //- Imported classes and packages -/
//---------------------------------/
import org.exolab.castor.xml.Marshaller;
import org.exolab.castor.xml.Unmarshaller;

/**
 * Class AtualizarAliquotaRequest.
 * 
 * @version $Revision: 1.1 $ $Date: 2017/04/11 14:10:57 $
 */
public class AtualizarAliquotaRequest implements java.io.Serializable {
    private static final long serialVersionUID = 1L;

      //--------------------------/
     //- Class/Member Variables -/
    //--------------------------/

    /**
     * Field _codMunicipio
     */
    private long _codMunicipio = 0;

    /**
     * keeps track of state for field: _codMunicipio
     */
    private boolean _has_codMunicipio;

    /**
     * Field _codTipoServico
     */
    private int _codTipoServico = 0;

    /**
     * keeps track of state for field: _codTipoServico
     */
    private boolean _has_codTipoServico;

    /**
     * Field _aliquota
     */
    private double _aliquota = 0;

    /**
     * keeps track of state for field: _aliquota
     */
    private boolean _has_aliquota;


      //----------------/
     //- Constructors -/
    //----------------/

    public AtualizarAliquotaRequest() 
     {
        super();
    } //-- br.com.bradesco.web.giss.service.data.pdc.atualizaraliquota.request.AtualizarAliquotaRequest()


      //-----------/
     //- Methods -/
    //-----------/

    /**
     * Method deleteAliquota
     * 
     */
    public void deleteAliquota()
    {
        this._has_aliquota= false;
    } //-- void deleteAliquota() 

    /**
     * Method deleteCodMunicipio
     * 
     */
    public void deleteCodMunicipio()
    {
        this._has_codMunicipio= false;
    } //-- void deleteCodMunicipio() 

    /**
     * Method deleteCodTipoServico
     * 
     */
    public void deleteCodTipoServico()
    {
        this._has_codTipoServico= false;
    } //-- void deleteCodTipoServico() 

    /**
     * Returns the value of field 'aliquota'.
     * 
     * @return double
     * @return the value of field 'aliquota'.
     */
    public double getAliquota()
    {
        return this._aliquota;
    } //-- double getAliquota() 

    /**
     * Returns the value of field 'codMunicipio'.
     * 
     * @return long
     * @return the value of field 'codMunicipio'.
     */
    public long getCodMunicipio()
    {
        return this._codMunicipio;
    } //-- long getCodMunicipio() 

    /**
     * Returns the value of field 'codTipoServico'.
     * 
     * @return int
     * @return the value of field 'codTipoServico'.
     */
    public int getCodTipoServico()
    {
        return this._codTipoServico;
    } //-- int getCodTipoServico() 

    /**
     * Method hasAliquota
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasAliquota()
    {
        return this._has_aliquota;
    } //-- boolean hasAliquota() 

    /**
     * Method hasCodMunicipio
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodMunicipio()
    {
        return this._has_codMunicipio;
    } //-- boolean hasCodMunicipio() 

    /**
     * Method hasCodTipoServico
     * 
     * 
     * 
     * @return boolean
     */
    public boolean hasCodTipoServico()
    {
        return this._has_codTipoServico;
    } //-- boolean hasCodTipoServico() 

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
     * Sets the value of field 'aliquota'.
     * 
     * @param aliquota the value of field 'aliquota'.
     */
    public void setAliquota(double aliquota)
    {
        this._aliquota = aliquota;
        this._has_aliquota = true;
    } //-- void setAliquota(double) 

    /**
     * Sets the value of field 'codMunicipio'.
     * 
     * @param codMunicipio the value of field 'codMunicipio'.
     */
    public void setCodMunicipio(long codMunicipio)
    {
        this._codMunicipio = codMunicipio;
        this._has_codMunicipio = true;
    } //-- void setCodMunicipio(long) 

    /**
     * Sets the value of field 'codTipoServico'.
     * 
     * @param codTipoServico the value of field 'codTipoServico'.
     */
    public void setCodTipoServico(int codTipoServico)
    {
        this._codTipoServico = codTipoServico;
        this._has_codTipoServico = true;
    } //-- void setCodTipoServico(int) 

    /**
     * Method unmarshal
     * 
     * 
     * 
     * @param reader
     * @return AtualizarAliquotaRequest
     */
    public static br.com.bradesco.web.giss.service.data.pdc.atualizaraliquota.request.AtualizarAliquotaRequest unmarshal(java.io.Reader reader)
        throws org.exolab.castor.xml.MarshalException, org.exolab.castor.xml.ValidationException
    {
        return (br.com.bradesco.web.giss.service.data.pdc.atualizaraliquota.request.AtualizarAliquotaRequest) Unmarshaller.unmarshal(br.com.bradesco.web.giss.service.data.pdc.atualizaraliquota.request.AtualizarAliquotaRequest.class, reader);
    } //-- br.com.bradesco.web.giss.service.data.pdc.atualizaraliquota.request.AtualizarAliquotaRequest unmarshal(java.io.Reader) 

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
